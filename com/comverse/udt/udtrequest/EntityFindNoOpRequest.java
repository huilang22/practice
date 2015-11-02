/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityFindNoOpRequest.java
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
 * NoOp class used to simulate a EntityFindNoOpRequest Udt Request/Response
 *
 */
public class EntityFindNoOpRequest extends EntityTypeRequest {
/**
 *
 * Constructor to create a   EntityFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EntityFindNoOpRequest(String id, EntityObjectDataList noOpIn) {
    super(id, "EntityFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EntityObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Entity", noOpIn);
      }
      addInput("Entity", mapList);
    }
  }
/**
 *
 * Retrieves the EntityObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EntityObjectDataList getOutput() {
    return EntityObjectHelper.fromMapList(outputMap, "EntityList");
  }
}
