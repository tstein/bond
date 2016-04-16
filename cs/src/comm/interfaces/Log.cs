// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

namespace Bond.Comm
{
    using System;

    /// <summary>
    /// Represents the severity of a message. Severities compare with &lt; and &gt;. e.g., Debug &lt; Information.
    /// </summary>
    public enum LogSeverity
    {
        Debug,
        Information,
        Warning,
        Error,
        Fatal
    }

    /// <summary>
    /// Once passed to <see cref="Log.AddHandler"/>, will receive callbacks for messages logged by Bond.
    /// </summary>
    public interface LogHandler
    {
        void Handle(LogSeverity severity, Exception exception, string format, object[] args);
    }

    /// <summary>
    /// By default, Bond is silent. Implement a <see cref="LogHandler"/> and pass it
    /// to <see cref="AddHandler"/> to receive log messages.
    /// </summary>
    public static class Log
    {
        private static LogHandler handler;

        public static void AddHandler(LogHandler newHandler)
        {
            if (newHandler == null)
            {
                throw new ArgumentException("Attempted to add a null LogHandler");
            }
            if (Log.handler != null)
            {
                throw new InvalidOperationException("Attempted to add a LogHandler when there already was one");
            }
            Log.handler = newHandler;
        }

        public static void RemoveHandler()
        {
            handler = null;
        }

        private static void LogMessage(LogSeverity severity, Exception exception, string format, object[] args)
        {
            handler?.Handle(severity, exception, format, args);
        }

        public static void Fatal(Exception exception, string format, params object[] args)
        {
            LogMessage(LogSeverity.Fatal, exception, format, args);
        }

        public static void Fatal(string format, params object[] args)
        {
            LogMessage(LogSeverity.Fatal, null, format, args);
        }

        public static void Error(Exception exception, string format, params object[] args)
        {
            LogMessage(LogSeverity.Error, exception, format, args);
        }

        public static void Error(string format, params object[] args)
        {
            LogMessage(LogSeverity.Error, null, format, args);
        }

        public static void Warning(Exception exception, string format, params object[] args)
        {
            LogMessage(LogSeverity.Warning, exception, format, args);
        }

        public static void Warning(string format, params object[] args)
        {
            LogMessage(LogSeverity.Warning, null, format, args);
        }

        public static void Information(Exception exception, string format, params object[] args)
        {
            LogMessage(LogSeverity.Information, exception, format, args);
        }

        public static void Information(string format, params object[] args)
        {
            LogMessage(LogSeverity.Information, null, format, args);
        }

        public static void Debug(Exception exception, string format, params object[] args)
        {
            LogMessage(LogSeverity.Debug, exception, format, args);
        }

        public static void Debug(string format, params object[] args)
        {
            LogMessage(LogSeverity.Debug, null, format, args);
        }
    }

    public class LogUtil
    {
        public static string FatalAndReturnFormatted(Exception exception, string format, params object[] args)
        {
            Log.Fatal(exception, format, args);
            return string.Format(format, args);
        }

        public static string FatalAndReturnFormatted(string format, params object[] args)
        {
            Log.Fatal(null, format, args);
            return string.Format(format, args);
        }
    }
}