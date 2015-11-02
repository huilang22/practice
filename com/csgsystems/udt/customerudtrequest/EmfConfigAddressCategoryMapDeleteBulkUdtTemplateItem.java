/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigAddressCategoryMapDeleteBulkUdtTemplateItem.java
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
 * Class used to create a EmfConfigAddressCategoryMapDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigAddressCategoryMapDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EmfConfigAddressCategoryMapObjectData ECACMDeleteIn;
/**
 *
 * Constructor to create a  EmfConfigAddressCategoryMapDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigAddressCategoryMapDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigAddressCategoryMapObjectData ECACMDeleteInIn) {
    super(id, context, "EmfConfigAddressCategoryMapDelete");
    ECACMDeleteIn = ECACMDeleteInIn;
  }

  public void translateToMap() {
    if (ECACMDeleteIn != null) {
      ECACMDeleteIn.resetFlags(true, true);
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(ECACMDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the EmfConfigAddressCategoryMap
 * @param ECACMDeleteInIn Value of the ECACMDeleteIn
 *
 */

  public void setEmfConfigAddressCategoryMap(EmfConfigAddressCategoryMapObjectData ECACMDeleteInIn) {
    ECACMDeleteIn = ECACMDeleteInIn;
  }

  public void translateFromMap() {
    ECACMDeleteIn = EmfConfigAddressCategoryMapObjectHelper.fromMap(inputMap, "EmfConfigAddressCategoryMap");
  }

/**
 *
 * Gets the EmfConfigAddressCategoryMap
 * @return Value of the EmfConfigAddressCategoryMap
 *
 */

  public EmfConfigAddressCategoryMapObjectData getEmfConfigAddressCategoryMap( ) {
    return ECACMDeleteIn;
  }

}
