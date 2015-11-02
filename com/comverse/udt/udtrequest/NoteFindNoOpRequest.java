/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteFindNoOpRequest.java
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
 * NoOp class used to simulate a NoteFindNoOpRequest Udt Request/Response
 *
 */
public class NoteFindNoOpRequest extends NoteRequest {
/**
 *
 * Constructor to create a   NoteFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteFindNoOpRequest(String id, NoteObjectDataList noOpIn) {
    super(id, "NoteFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NoteObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Note", noOpIn);
      }
      addInput("Note", mapList);
    }
  }
/**
 *
 * Retrieves the NoteObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NoteObjectDataList getOutput() {
    return NoteObjectHelper.fromMapList(outputMap, "NoteList");
  }
}
