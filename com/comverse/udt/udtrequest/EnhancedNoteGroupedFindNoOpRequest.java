/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteGroupedFindNoOpRequest.java
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
 * NoOp class used to simulate a EnhancedNoteGroupedFindNoOpRequest Udt Request/Response
 *
 */
public class EnhancedNoteGroupedFindNoOpRequest extends EnhancedNoteRequest {
/**
 *
 * Constructor to create a   EnhancedNoteGroupedFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EnhancedNoteGroupedFindNoOpRequest(String id, EnhancedNoteObjectDataList noOpIn) {
    super(id, "EnhancedNoteGroupedFindNoOpRequest");
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
