/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EntityTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EntityTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EntityTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   EntityTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EntityTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeObjectData noOpInIn) {
    super(id, context, "EntityTypeGet");
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
