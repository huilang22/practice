/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTextFindNoOpRequest.java
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
 * NoOp class used to simulate a NoteTextFindNoOpRequest Udt Request/Response
 *
 */
public class NoteTextFindNoOpRequest extends NoteTextRequest {
/**
 *
 * Constructor to create a   NoteTextFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteTextFindNoOpRequest(String id, NoteTextObjectDataList noOpIn) {
    super(id, "NoteTextFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NoteTextObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteText", noOpIn);
      }
      addInput("NoteText", mapList);
    }
  }
/**
 *
 * Retrieves the NoteTextObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTextObjectDataList getOutput() {
    return NoteTextObjectHelper.fromMapList(outputMap, "NoteTextList");
  }
}
