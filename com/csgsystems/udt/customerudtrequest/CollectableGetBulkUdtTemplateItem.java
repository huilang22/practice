/*
 * Generated code DO NOT EDIT
 * Generated file: CollectableGetBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * Class used to create a CollectableGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CollectableGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CollectableObjectKeyData getIn;
/**
 *
 * Constructor to create a  CollectableGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CollectableGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CollectableObjectKeyData getInIn) {
    super(id, context, "CollectableGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("Collectable", CollectableObjectKeyHelper.toMap(getIn, new HashMap(), "CollectableObjectKeyData").get("CollectableObjectKeyData"));
    }
  }


/**
 *
 * Sets the Collectable
 * @param getInIn Value of the getIn
 *
 */

  public void setCollectable(CollectableObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = CollectableObjectKeyHelper.fromMap(inputMap, "Collectable");
  }

/**
 *
 * Gets the Collectable
 * @return Value of the Collectable
 *
 */

  public CollectableObjectKeyData getCollectable( ) {
    return getIn;
  }

}
