/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EntityTypeGroupGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EntityTypeGroupGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EntityTypeGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   EntityTypeGroupGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EntityTypeGroupGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupObjectData noOpInIn) {
    super(id, context, "EntityTypeGroupGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(noOpIn, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }
/**
 *
 * Sets the  EntityTypeGroup
 * @param noOpInIn EntityTypeGroupObjectData to set
 *
 */
  public void setEntityTypeGroup(EntityTypeGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EntityTypeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeGroupObjectData getEntityTypeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EntityTypeGroupObjectHelper.fromMap(inputMap, "EntityTypeGroup");
  }
}
