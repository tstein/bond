
//------------------------------------------------------------------------------
// This code was generated by a tool.
//
//   Tool : Bond Compiler 0.8.0.0
//   Input filename:  ../idl/bond/core/bond.bond
//   Output filename: Modifier.java
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// <auto-generated />
//------------------------------------------------------------------------------

package com.microsoft.bond;


public enum Modifier {
    Optional(0),
    Required(1),
    RequiredOptional(2);

    public int value;

    Modifier(int value) { this.value = value; }
}
