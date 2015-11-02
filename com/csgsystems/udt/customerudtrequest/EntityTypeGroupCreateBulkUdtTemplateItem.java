/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeGroupObjectData EntityTypeGRPCreateIn;
/**
 *
 * Constructor to create a  EntityTypeGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupObjectData EntityTypeGRPCreateInIn) {
    super(id, context, "EntityTypeGroupCreate");
    EntityTypeGRPCreateIn = EntityTypeGRPCreateInIn;
  }

  public void translateToMap() {
    if (EntityTypeGRPCreateIn != null) {
      EntityTypeGRPCreateIn.resetFlags(true, true);
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(EntityTypeGRPCreateIn, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }


/**
 *
 * Sets the EntityTypeGroup
 * @param EntityTypeGRPCreateInIn Value of the EntityTypeGRPCreateIn
 *
 */

  public void setEntityTypeGroup(EntityTypeGroupObjectData EntityTypeGRPCreateInIn) {
    EntityTypeGRPCreateIn = EntityTypeGRPCreateInIn;
  }

  public void translateFromMap() {
    EntityTypeGRPCreateIn = EntityTypeGroupObjectHelper.fromMap(inputMap, "EntityTypeGroup");
  }

/**
 *
 * Gets the EntityTypeGroup
 * @return Value of the EntityTypeGroup
 *
 */

  public EntityTypeGroupObjectData getEntityTypeGroup( ) {
    return EntityTypeGRPCreateIn;
  }

}
