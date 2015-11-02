/*
 * Generated code DO NOT EDIT
 * Generated file: SubscriberGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a SubscriberGetBulkUdtTemplateItem Bulk Template
 *
 */

public class SubscriberGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GetSubscriberObjectData SubGetIn;
/**
 *
 * Constructor to create a  SubscriberGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SubscriberGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GetSubscriberObjectData SubGetInIn) {
    super(id, context, "SubscriberGet");
    SubGetIn = SubGetInIn;
  }

  public void translateToMap() {
    if (SubGetIn != null) {
      SubGetIn.resetFlags(true, true);
      addInput("PolicyInstance", GetSubscriberObjectHelper.toMap(SubGetIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }


/**
 *
 * Sets the PolicyInstance
 * @param SubGetInIn Value of the SubGetIn
 *
 */

  public void setPolicyInstance(GetSubscriberObjectData SubGetInIn) {
    SubGetIn = SubGetInIn;
  }

  public void translateFromMap() {
    SubGetIn = GetSubscriberObjectHelper.fromMap(inputMap, "PolicyInstance");
  }

/**
 *
 * Gets the PolicyInstance
 * @return Value of the PolicyInstance
 *
 */

  public GetSubscriberObjectData getPolicyInstance( ) {
    return SubGetIn;
  }

}
