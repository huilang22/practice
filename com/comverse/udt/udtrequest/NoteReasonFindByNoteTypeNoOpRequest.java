/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonFindByNoteTypeNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a NoteReasonFindByNoteTypeNoOpRequest Udt Request/Response
 *
 */
public class NoteReasonFindByNoteTypeNoOpRequest extends NoteReasonRequest {
/**
 *
 * Constructor to create a   NoteReasonFindByNoteTypeNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteReasonFindByNoteTypeNoOpRequest(String id, NoteReasonObjectDataList noOpIn) {
    super(id, "NoteReasonFindByNoteTypeNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NoteReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteReason", noOpIn);
      }
      addInput("NoteReason", mapList);
    }
  }
/**
 *
 * Retrieves the NoteReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NoteReasonObjectDataList getOutput() {
    return NoteReasonObjectHelper.fromMapList(outputMap, "NoteReasonList");
  }
}
