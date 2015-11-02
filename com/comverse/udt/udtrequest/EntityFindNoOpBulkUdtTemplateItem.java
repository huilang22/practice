/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityFindNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a EntityFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EntityFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EntityObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EntityFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EntityFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectDataList noOpInIn) {
    super(id, context, "EntityFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = EntityObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Entity", noOpIn);
      }
      addInput("Entity", mapList);
    }
  }
/**
 *
 * Sets the  Entity
 * @param noOpInIn EntityObjectDataList to set
 *
 */
  public void setEntity(EntityObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Entity passed into the constructor
 * @return Simulated response
 *
 */
  public EntityObjectDataList getEntity() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EntityObjectHelper.fromMapList(inputMap, "EntityList");
  }
}
