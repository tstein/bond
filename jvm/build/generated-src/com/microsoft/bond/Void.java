
//------------------------------------------------------------------------------
// This code was generated by a tool.
//
//   Tool : Bond Compiler 0.8.0.0
//   Input filename:  ../idl/bond/core/bond.bond
//   Output filename: Void.java
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// <auto-generated />
//------------------------------------------------------------------------------

package com.microsoft.bond;

// Standard imports used by Bond.
import java.math.BigInteger;
import java.util.*;
import java.io.IOException;

// Bond lib imports.
import com.microsoft.bond.*;
import com.microsoft.bond.protocol.*;

// Imports for other generated code.


public class Void implements BondSerializable {
    


    @Override
    public void marshal(ProtocolWriter writer) throws IOException {
        writer.writeVersion();

// FIXME: Where is my metadata?
        writer.writeStructBegin(null);
        
        writer.writeStructEnd();
    }
}
