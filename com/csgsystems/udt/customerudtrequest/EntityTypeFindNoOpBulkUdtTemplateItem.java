/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a EntityTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EntityTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EntityTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EntityTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EntityTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeObjectDataList noOpInIn) {
    super(id, context, "EntityTypeFind");
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
        mapArray[i] = EntityTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EntityType", noOpIn);
      }
      addInput("EntityType", mapList);
    }
  }
/**
 *
 * Sets the  EntityType
 * @param noOpInIn EntityTypeObjectDataList to set
 *
 */
  public void setEntityType(EntityTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EntityType passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeObjectDataList getEntityType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EntityTypeObjectHelper.fromMapList(inputMap, "EntityTypeList");
  }
}
