
//------------------------------------------------------------------------------
// This code was generated by a tool.
//
//   Tool : Bond Compiler 0.8.0.0
//   Input filename:  ../idl/bond/core/bond.bond
//   Output filename: FieldDef.java
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


public class FieldDef implements BondSerializable {
    public Metadata metadata = new Metadata();

    public int id = 0;

    public TypeDef type = new TypeDef();


    @Override
    public void marshal(ProtocolWriter writer) throws IOException {
        writer.writeVersion();

// FIXME: Where is my metadata?
        writer.writeStructBegin(null);
        
// FIXME: Where is my metadata?
        writer.writeFieldBegin(BondDataType.BT_UNAVAILABLE, 0, null);
        // FIXME: Not implemented.
        writer.writeFieldEnd();
        
// FIXME: Where is my metadata?
        writer.writeFieldBegin(BondDataType.BT_UINT16, 1, null);
        writer.writeUInt16(this.id);
        writer.writeFieldEnd();
        
// FIXME: Where is my metadata?
        writer.writeFieldBegin(BondDataType.BT_UNAVAILABLE, 2, null);
        // FIXME: Not implemented.
        writer.writeFieldEnd();
        
        writer.writeStructEnd();
    }
}
