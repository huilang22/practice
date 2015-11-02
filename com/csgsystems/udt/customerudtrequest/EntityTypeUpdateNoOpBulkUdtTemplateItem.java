/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EntityTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EntityTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EntityTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   EntityTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EntityTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeObjectData noOpInIn) {
    super(id, context, "EntityTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EntityType", EntityTypeObjectHelper.toMap(noOpIn, new HashMap(), "EntityType").get("EntityType"));
    }
  }
/**
 *
 * Sets the  EntityType
 * @param noOpInIn EntityTypeObjectData to set
 *
 */
  public void setEntityType(EntityTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EntityType passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeObjectData getEntityType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EntityTypeObjectHelper.fromMap(inputMap, "EntityType");
  }
}
