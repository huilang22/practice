/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SubscriberCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a SubscriberCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class SubscriberCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SubscriberObjectData SubCrIn;
/**
 *
 * Constructor to create a  SubscriberCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SubscriberCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, SubscriberObjectData SubCrInIn) {
    super(id, context, "SubscriberCreate");
    SubCrIn = SubCrInIn;
  }

  public void translateToMap() {
    if (SubCrIn != null) {
      SubCrIn.resetFlags(true, true);
      addInput("PolicyInstance", SubscriberObjectHelper.toMap(SubCrIn, new HashMap(), "Success").get("Success"));
    }
  }


/**
 *
 * Sets the PolicyInstance
 * @param SubCrInIn Value of the SubCrIn
 *
 */

  public void setPolicyInstance(SubscriberObjectData SubCrInIn) {
    SubCrIn = SubCrInIn;
  }

  public void translateFromMap() {
    SubCrIn = SubscriberObjectHelper.fromMap(inputMap, "PolicyInstance");
  }

/**
 *
 * Gets the PolicyInstance
 * @return Value of the PolicyInstance
 *
 */

  public SubscriberObjectData getPolicyInstance( ) {
    return SubCrIn;
  }

}
