/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreFindNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcGenreFindNoOpRequest Udt Request/Response
 *
 */
public class CtcGenreFindNoOpRequest extends CtcGenreRequest {
/**
 *
 * Constructor to create a   CtcGenreFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcGenreFindNoOpRequest(String id, CtcGenreObjectDataList noOpIn) {
    super(id, "CtcGenreFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcGenreObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcGenre", noOpIn);
      }
      addInput("CtcGenre", mapList);
    }
  }
/**
 *
 * Retrieves the CtcGenreObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcGenreObjectDataList getOutput() {
    return CtcGenreObjectHelper.fromMapList(outputMap, "CtcGenreList");
  }
}
