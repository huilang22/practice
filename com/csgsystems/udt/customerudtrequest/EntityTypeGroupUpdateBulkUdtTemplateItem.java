/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeGroupObjectData EntityTypeGRPUpdateIn;
/**
 *
 * Constructor to create a  EntityTypeGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupObjectData EntityTypeGRPUpdateInIn) {
    super(id, context, "EntityTypeGroupUpdate");
    EntityTypeGRPUpdateIn = EntityTypeGRPUpdateInIn;
  }

  public void translateToMap() {
    if (EntityTypeGRPUpdateIn != null) {
      EntityTypeGRPUpdateIn.resetFlags(true, true);
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(EntityTypeGRPUpdateIn, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }


/**
 *
 * Sets the EntityTypeGroup
 * @param EntityTypeGRPUpdateInIn Value of the EntityTypeGRPUpdateIn
 *
 */

  public void setEntityTypeGroup(EntityTypeGroupObjectData EntityTypeGRPUpdateInIn) {
    EntityTypeGRPUpdateIn = EntityTypeGRPUpdateInIn;
  }

  public void translateFromMap() {
    EntityTypeGRPUpdateIn = EntityTypeGroupObjectHelper.fromMap(inputMap, "EntityTypeGroup");
  }

/**
 *
 * Gets the EntityTypeGroup
 * @return Value of the EntityTypeGroup
 *
 */

  public EntityTypeGroupObjectData getEntityTypeGroup( ) {
    return EntityTypeGRPUpdateIn;
  }

}
