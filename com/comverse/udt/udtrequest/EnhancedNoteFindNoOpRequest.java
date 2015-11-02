/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteFindNoOpRequest.java
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
 * NoOp class used to simulate a EnhancedNoteFindNoOpRequest Udt Request/Response
 *
 */
public class EnhancedNoteFindNoOpRequest extends EnhancedNoteRequest {
/**
 *
 * Constructor to create a   EnhancedNoteFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EnhancedNoteFindNoOpRequest(String id, EnhancedNoteObjectDataList noOpIn) {
    super(id, "EnhancedNoteFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EnhancedNoteObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EnhancedNote", noOpIn);
      }
      addInput("EnhancedNote", mapList);
    }
  }
/**
 *
 * Retrieves the EnhancedNoteObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EnhancedNoteObjectDataList getOutput() {
    return EnhancedNoteObjectHelper.fromMapList(outputMap, "EnhancedNoteList");
  }
}
