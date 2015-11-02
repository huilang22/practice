/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactFindNoOpRequest.java
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
 * NoOp class used to simulate a ContactFindNoOpRequest Udt Request/Response
 *
 */
public class ContactFindNoOpRequest extends ContactRequest {
/**
 *
 * Constructor to create a   ContactFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContactFindNoOpRequest(String id, ContactObjectDataList noOpIn) {
    super(id, "ContactFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ContactObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Contact", noOpIn);
      }
      addInput("Contact", mapList);
    }
  }
/**
 *
 * Retrieves the ContactObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ContactObjectDataList getOutput() {
    return ContactObjectHelper.fromMapList(outputMap, "ContactList");
  }
}
