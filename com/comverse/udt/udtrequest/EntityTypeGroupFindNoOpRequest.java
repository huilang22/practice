/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a EntityTypeGroupFindNoOpRequest Udt Request/Response
 *
 */
public class EntityTypeGroupFindNoOpRequest extends EntityTypeGroupRequest {
/**
 *
 * Constructor to create a   EntityTypeGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EntityTypeGroupFindNoOpRequest(String id, EntityTypeGroupObjectDataList noOpIn) {
    super(id, "EntityTypeGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EntityTypeGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EntityTypeGroup", noOpIn);
      }
      addInput("EntityTypeGroup", mapList);
    }
  }
/**
 *
 * Retrieves the EntityTypeGroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeGroupObjectDataList getOutput() {
    return EntityTypeGroupObjectHelper.fromMapList(outputMap, "EntityTypeGroupList");
  }
}
