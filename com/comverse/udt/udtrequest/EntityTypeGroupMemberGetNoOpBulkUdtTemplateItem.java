/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EntityTypeGroupMemberGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EntityTypeGroupMemberGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EntityTypeGroupMemberObjectData noOpIn;

/**
 *
 * Constructor to create a   EntityTypeGroupMemberGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EntityTypeGroupMemberGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupMemberObjectData noOpInIn) {
    super(id, context, "EntityTypeGroupMemberGet");
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
