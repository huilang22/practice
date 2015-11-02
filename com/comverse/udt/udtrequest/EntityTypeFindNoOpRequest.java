/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a EntityTypeFindNoOpRequest Udt Request/Response
 *
 */
public class EntityTypeFindNoOpRequest extends EntityTypeRequest {
/**
 *
 * Constructor to create a   EntityTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EntityTypeFindNoOpRequest(String id, EntityTypeObjectDataList noOpIn) {
    super(id, "EntityTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EntityTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EntityType", noOpIn);
      }
      addInput("EntityType", mapList);
    }
  }
/**
 *
 * Retrieves the EntityTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeObjectDataList getOutput() {
    return EntityTypeObjectHelper.fromMapList(outputMap, "EntityTypeList");
  }
}
