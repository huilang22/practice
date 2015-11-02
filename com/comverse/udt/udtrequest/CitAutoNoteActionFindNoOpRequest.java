/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionFindNoOpRequest.java
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

import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitAutoNoteActionFindNoOpRequest Udt Request/Response
 *
 */
public class CitAutoNoteActionFindNoOpRequest extends CitAutoNoteActionRequest {
/**
 *
 * Constructor to create a   CitAutoNoteActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitAutoNoteActionFindNoOpRequest(String id, CitAutoNoteActionObjectDataList noOpIn) {
    super(id, "CitAutoNoteActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CitAutoNoteActionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitAutoNoteAction", noOpIn);
      }
      addInput("CitAutoNoteAction", mapList);
    }
  }
/**
 *
 * Retrieves the CitAutoNoteActionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CitAutoNoteActionObjectDataList getOutput() {
    return CitAutoNoteActionObjectHelper.fromMapList(outputMap, "CitAutoNoteActionList");
  }
}
