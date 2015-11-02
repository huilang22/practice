/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFeedFileFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcFeedFileFindNoOpRequest Udt Request/Response
 *
 */
public class CtcFeedFileFindNoOpRequest extends CtcFeedFileRequest {
/**
 *
 * Constructor to create a   CtcFeedFileFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcFeedFileFindNoOpRequest(String id, CtcFeedFileObjectDataList noOpIn) {
    super(id, "CtcFeedFileFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcFeedFileObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcFeedFile", noOpIn);
      }
      addInput("CtcFeedFile", mapList);
    }
  }
/**
 *
 * Retrieves the CtcFeedFileObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFeedFileObjectDataList getOutput() {
    return CtcFeedFileObjectHelper.fromMapList(outputMap, "CtcFeedFileList");
  }
}
