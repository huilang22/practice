/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeObjectData EntityTypeCreateIn;
/**
 *
 * Constructor to create a  EntityTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeObjectData EntityTypeCreateInIn) {
    super(id, context, "EntityTypeCreate");
    EntityTypeCreateIn = EntityTypeCreateInIn;
  }

  public void translateToMap() {
    if (EntityTypeCreateIn != null) {
      EntityTypeCreateIn.resetFlags(true, true);
      addInput("EntityType", EntityTypeObjectHelper.toMap(EntityTypeCreateIn, new HashMap(), "EntityType").get("EntityType"));
    }
  }


/**
 *
 * Sets the EntityType
 * @param EntityTypeCreateInIn Value of the EntityTypeCreateIn
 *
 */

  public void setEntityType(EntityTypeObjectData EntityTypeCreateInIn) {
    EntityTypeCreateIn = EntityTypeCreateInIn;
  }

  public void translateFromMap() {
    EntityTypeCreateIn = EntityTypeObjectHelper.fromMap(inputMap, "EntityType");
  }

/**
 *
 * Gets the EntityType
 * @return Value of the EntityType
 *
 */

  public EntityTypeObjectData getEntityType( ) {
    return EntityTypeCreateIn;
  }

}
