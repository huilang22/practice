/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerFindNoOpRequest.java
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
 * NoOp class used to simulate a ServerFindNoOpRequest Udt Request/Response
 *
 */
public class ServerFindNoOpRequest extends ServerRequest {
/**
 *
 * Constructor to create a   ServerFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServerFindNoOpRequest(String id, ServerObjectDataList noOpIn) {
    super(id, "ServerFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServerObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Server", noOpIn);
      }
      addInput("Server", mapList);
    }
  }
/**
 *
 * Retrieves the ServerObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServerObjectDataList getOutput() {
    return ServerObjectHelper.fromMapList(outputMap, "ServerList");
  }
}
