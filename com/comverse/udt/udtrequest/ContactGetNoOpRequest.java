/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactGetNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ContactGetNoOpRequest Udt Request/Response
 *
 */
public class ContactGetNoOpRequest extends ContactSubRequestParent {
/**
 *
 * Constructor to create a   ContactGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContactGetNoOpRequest(String id, ContactObjectData noOpIn) {
    super(id, "ContactGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Contact", ContactObjectHelper.toMap(noOpIn, new HashMap(), "Contact").get("Contact"));
    }
  }
/**
 *
 * Retrieves the ContactObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ContactObjectData getOutput() {
    return ContactObjectHelper.fromMap(outputMap, "Contact");
  }
}
