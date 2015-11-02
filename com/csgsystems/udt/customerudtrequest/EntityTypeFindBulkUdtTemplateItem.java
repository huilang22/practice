/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeObjectFilter EntityTypeFindIn;
/**
 *
 * Constructor to create a  EntityTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeObjectFilter EntityTypeFindInIn) {
    super(id, context, "EntityTypeFind");
    EntityTypeFindIn = EntityTypeFindInIn;
  }

  public void translateToMap() {
    if (EntityTypeFindIn != null) {
      Integer index =  EntityTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EntityType", EntityTypeObjectHelper.toMap(EntityTypeFindIn, new HashMap(), "EntityType").get("EntityType"));
    }
  }


/**
 *
 * Sets the EntityType
 * @param EntityTypeFindInIn Value of the EntityTypeFindIn
 *
 */

  public void setEntityType(EntityTypeObjectFilter EntityTypeFindInIn) {
    EntityTypeFindIn = EntityTypeFindInIn;
  }

  public void translateFromMap() {
    EntityTypeFindIn = EntityTypeObjectHelper.fromMapFilter(inputMap, "EntityType");
  }

/**
 *
 * Gets the EntityType
 * @return Value of the EntityType
 *
 */

  public EntityTypeObjectFilter getEntityType( ) {
    return EntityTypeFindIn;
  }

}
