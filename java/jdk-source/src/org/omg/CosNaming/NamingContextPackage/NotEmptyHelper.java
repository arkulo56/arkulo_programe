package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/NotEmptyHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-macosx-x86_64/jdk8u73/6086/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Friday, January 29, 2016 3:03:46 PM PST
*/

abstract public class NotEmptyHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/NamingContext/NotEmpty:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CosNaming.NamingContextPackage.NotEmpty that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CosNaming.NamingContextPackage.NotEmpty extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (org.omg.CosNaming.NamingContextPackage.NotEmptyHelper.id (), "NotEmpty", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CosNaming.NamingContextPackage.NotEmpty read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.CosNaming.NamingContextPackage.NotEmpty value = new org.omg.CosNaming.NamingContextPackage.NotEmpty ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CosNaming.NamingContextPackage.NotEmpty value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}
