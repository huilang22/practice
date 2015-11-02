/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ComponentPolicyMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentPolicyMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentPolicyMapObjectData cmpUpdateIn;
/**
 *
 * Constructor to create a  ComponentPolicyMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentPolicyMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentPolicyMapObjectData cmpUpdateInIn) {
    super(id, context, "ComponentPolicyMapUpdate");
    cmpUpdateIn = cmpUpdateInIn;
  }

  public void translateToMap() {
    if (cmpUpdateIn != null) {
      cmpUpdateIn.resetFlags(true, true);
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(cmpUpdateIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }


/**
 *
 * Sets the ComponentPolicyMap
 * @param cmpUpdateInIn Value of the cmpUpdateIn
 *
 */

  public void setComponentPolicyMap(ComponentPolicyMapObjectData cmpUpdateInIn) {
    cmpUpdateIn = cmpUpdateInIn;
  }

  public void translateFromMap() {
    cmpUpdateIn = ComponentPolicyMapObjectHelper.fromMap(inputMap, "ComponentPolicyMap");
  }

/**
 *
 * Gets the ComponentPolicyMap
 * @return Value of the ComponentPolicyMap
 *
 */

  public ComponentPolicyMapObjectData getComponentPolicyMap( ) {
    return cmpUpdateIn;
  }

}
