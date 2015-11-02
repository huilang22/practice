/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a NoteCodeFindNoOpRequest Udt Request/Response
 *
 */
public class NoteCodeFindNoOpRequest extends NoteCodeRequest {
/**
 *
 * Constructor to create a   NoteCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteCodeFindNoOpRequest(String id, NoteCodeObjectDataList noOpIn) {
    super(id, "NoteCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NoteCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteCode", noOpIn);
      }
      addInput("NoteCode", mapList);
    }
  }
/**
 *
 * Retrieves the NoteCodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NoteCodeObjectDataList getOutput() {
    return NoteCodeObjectHelper.fromMapList(outputMap, "NoteCodeList");
  }
}
