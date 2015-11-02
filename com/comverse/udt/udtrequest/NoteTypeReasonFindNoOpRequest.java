/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonFindNoOpRequest.java
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
 * NoOp class used to simulate a NoteTypeReasonFindNoOpRequest Udt Request/Response
 *
 */
public class NoteTypeReasonFindNoOpRequest extends NoteTypeReasonRequest {
/**
 *
 * Constructor to create a   NoteTypeReasonFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteTypeReasonFindNoOpRequest(String id, NoteTypeReasonObjectDataList noOpIn) {
    super(id, "NoteTypeReasonFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = NoteTypeReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteTypeReason", noOpIn);
      }
      addInput("NoteTypeReason", mapList);
    }
  }
/**
 *
 * Retrieves the NoteTypeReasonObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTypeReasonObjectDataList getOutput() {
    return NoteTypeReasonObjectHelper.fromMapList(outputMap, "NoteTypeReasonList");
  }
}
