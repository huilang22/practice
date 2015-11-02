/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeGroupDeleteBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeGroupDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeGroupDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeGroupObjectKeyData EntityTypeGRPDeleteIn;
/**
 *
 * Constructor to create a  EntityTypeGroupDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeGroupDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupObjectKeyData EntityTypeGRPDeleteInIn) {
    super(id, context, "EntityTypeGroupDelete");
    EntityTypeGRPDeleteIn = EntityTypeGRPDeleteInIn;
  }

  public void translateToMap() {
    if (EntityTypeGRPDeleteIn != null) {
      EntityTypeGRPDeleteIn.resetFlags(true, true);
      addInput("EntityTypeGroup", EntityTypeGroupObjectKeyHelper.toMap(EntityTypeGRPDeleteIn, new HashMap(), "EntityTypeGroupObjectKeyData").get("EntityTypeGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the EntityTypeGroup
 * @param EntityTypeGRPDeleteInIn Value of the EntityTypeGRPDeleteIn
 *
 */

  public void setEntityTypeGroup(EntityTypeGroupObjectKeyData EntityTypeGRPDeleteInIn) {
    EntityTypeGRPDeleteIn = EntityTypeGRPDeleteInIn;
  }

  public void translateFromMap() {
    EntityTypeGRPDeleteIn = EntityTypeGroupObjectKeyHelper.fromMap(inputMap, "EntityTypeGroup");
  }

/**
 *
 * Gets the EntityTypeGroup
 * @return Value of the EntityTypeGroup
 *
 */

  public EntityTypeGroupObjectKeyData getEntityTypeGroup( ) {
    return EntityTypeGRPDeleteIn;
  }

}
