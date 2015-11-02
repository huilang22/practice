/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigAddressCategoryMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a EmfConfigAddressCategoryMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigAddressCategoryMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EmfConfigAddressCategoryMapObjectData ECACMCreateIn;
/**
 *
 * Constructor to create a  EmfConfigAddressCategoryMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigAddressCategoryMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigAddressCategoryMapObjectData ECACMCreateInIn) {
    super(id, context, "EmfConfigAddressCategoryMapCreate");
    ECACMCreateIn = ECACMCreateInIn;
  }

  public void translateToMap() {
    if (ECACMCreateIn != null) {
      ECACMCreateIn.resetFlags(true, true);
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(ECACMCreateIn, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }


/**
 *
 * Sets the EmfConfigAddressCategoryMap
 * @param ECACMCreateInIn Value of the ECACMCreateIn
 *
 */

  public void setEmfConfigAddressCategoryMap(EmfConfigAddressCategoryMapObjectData ECACMCreateInIn) {
    ECACMCreateIn = ECACMCreateInIn;
  }

  public void translateFromMap() {
    ECACMCreateIn = EmfConfigAddressCategoryMapObjectHelper.fromMap(inputMap, "EmfConfigAddressCategoryMap");
  }

/**
 *
 * Gets the EmfConfigAddressCategoryMap
 * @return Value of the EmfConfigAddressCategoryMap
 *
 */

  public EmfConfigAddressCategoryMapObjectData getEmfConfigAddressCategoryMap( ) {
    return ECACMCreateIn;
  }

}
