/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeGroupMemberGetBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeGroupMemberGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeGroupMemberGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeGroupMemberObjectKeyData entTypeGrpGetIn;
/**
 *
 * Constructor to create a  EntityTypeGroupMemberGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeGroupMemberGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupMemberObjectKeyData entTypeGrpGetInIn) {
    super(id, context, "EntityTypeGroupMemberGet");
    entTypeGrpGetIn = entTypeGrpGetInIn;
  }

  public void translateToMap() {
    if (entTypeGrpGetIn != null) {
      entTypeGrpGetIn.resetFlags(true, true);
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectKeyHelper.toMap(entTypeGrpGetIn, new HashMap(), "EntityTypeGroupMemberObjectKeyData").get("EntityTypeGroupMemberObjectKeyData"));
    }
  }


/**
 *
 * Sets the EntityTypeGroupMember
 * @param entTypeGrpGetInIn Value of the entTypeGrpGetIn
 *
 */

  public void setEntityTypeGroupMember(EntityTypeGroupMemberObjectKeyData entTypeGrpGetInIn) {
    entTypeGrpGetIn = entTypeGrpGetInIn;
  }

  public void translateFromMap() {
    entTypeGrpGetIn = EntityTypeGroupMemberObjectKeyHelper.fromMap(inputMap, "EntityTypeGroupMember");
  }

/**
 *
 * Gets the EntityTypeGroupMember
 * @return Value of the EntityTypeGroupMember
 *
 */

  public EntityTypeGroupMemberObjectKeyData getEntityTypeGroupMember( ) {
    return entTypeGrpGetIn;
  }

}
