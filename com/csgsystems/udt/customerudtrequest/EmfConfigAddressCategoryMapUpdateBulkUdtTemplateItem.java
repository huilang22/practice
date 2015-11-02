/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigAddressCategoryMapUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EmfConfigAddressCategoryMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigAddressCategoryMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EmfConfigAddressCategoryMapObjectData ECACMUpdateIn;
/**
 *
 * Constructor to create a  EmfConfigAddressCategoryMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigAddressCategoryMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigAddressCategoryMapObjectData ECACMUpdateInIn) {
    super(id, context, "EmfConfigAddressCategoryMapUpdate");
    ECACMUpdateIn = ECACMUpdateInIn;
  }

  public void translateToMap() {
    if (ECACMUpdateIn != null) {
      ECACMUpdateIn.resetFlags(true, true);
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(ECACMUpdateIn, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }


/**
 *
 * Sets the EmfConfigAddressCategoryMap
 * @param ECACMUpdateInIn Value of the ECACMUpdateIn
 *
 */

  public void setEmfConfigAddressCategoryMap(EmfConfigAddressCategoryMapObjectData ECACMUpdateInIn) {
    ECACMUpdateIn = ECACMUpdateInIn;
  }

  public void translateFromMap() {
    ECACMUpdateIn = EmfConfigAddressCategoryMapObjectHelper.fromMap(inputMap, "EmfConfigAddressCategoryMap");
  }

/**
 *
 * Gets the EmfConfigAddressCategoryMap
 * @return Value of the EmfConfigAddressCategoryMap
 *
 */

  public EmfConfigAddressCategoryMapObjectData getEmfConfigAddressCategoryMap( ) {
    return ECACMUpdateIn;
  }

}
