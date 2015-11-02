/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionNoteFindNoOpRequest.java
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
 * NoOp class used to simulate a CitInteractionNoteFindNoOpRequest Udt Request/Response
 *
 */
public class CitInteractionNoteFindNoOpRequest extends CitInteractionRequest {
/**
 *
 * Constructor to create a   CitInteractionNoteFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitInteractionNoteFindNoOpRequest(String id, CitInteractionNoteObjectDataList noOpIn) {
    super(id, "CitInteractionNoteFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CitInteractionNoteObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitInteraction", noOpIn);
      }
      addInput("CitInteraction", mapList);
    }
  }
/**
 *
 * Retrieves the CitInteractionNoteObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CitInteractionNoteObjectDataList getOutput() {
    return CitInteractionNoteObjectHelper.fromMapList(outputMap, "CitInteractionList");
  }
}
