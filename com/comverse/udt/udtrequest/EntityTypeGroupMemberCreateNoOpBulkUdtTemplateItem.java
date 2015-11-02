/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EntityTypeGroupMemberCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EntityTypeGroupMemberCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EntityTypeGroupMemberObjectData noOpIn;

/**
 *
 * Constructor to create a   EntityTypeGroupMemberCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EntityTypeGroupMemberCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupMemberObjectData noOpInIn) {
    super(id, context, "EntityTypeGroupMemberCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(noOpIn, new HashMap(), "EntityTypeGroupMember").get("EntityTypeGroupMember"));
    }
  }
/**
 *
 * Sets the  EntityTypeGroupMember
 * @param noOpInIn EntityTypeGroupMemberObjectData to set
 *
 */
  public void setEntityTypeGroupMember(EntityTypeGroupMemberObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EntityTypeGroupMember passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeGroupMemberObjectData getEntityTypeGroupMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EntityTypeGroupMemberObjectHelper.fromMap(inputMap, "EntityTypeGroupMember");
  }
}
