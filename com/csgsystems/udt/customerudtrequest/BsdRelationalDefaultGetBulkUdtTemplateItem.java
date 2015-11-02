/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalDefaultGetBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdRelationalDefaultGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalDefaultGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalDefaultObjectBaseKeyData bsdRelationalDefaultGetIn;
/**
 *
 * Constructor to create a  BsdRelationalDefaultGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalDefaultGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalDefaultObjectBaseKeyData bsdRelationalDefaultGetInIn) {
    super(id, context, "BsdRelationalDefaultGet");
    bsdRelationalDefaultGetIn = bsdRelationalDefaultGetInIn;
  }

  public void translateToMap() {
    if (bsdRelationalDefaultGetIn != null) {
      bsdRelationalDefaultGetIn.resetFlags(true, true);
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseKeyHelper.toMap(bsdRelationalDefaultGetIn, new HashMap(), "BsdRelationalDefaultObjectBaseKeyData").get("BsdRelationalDefaultObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdRelationalDefault
 * @param bsdRelationalDefaultGetInIn Value of the bsdRelationalDefaultGetIn
 *
 */

  public void setBsdRelationalDefault(BsdRelationalDefaultObjectBaseKeyData bsdRelationalDefaultGetInIn) {
    bsdRelationalDefaultGetIn = bsdRelationalDefaultGetInIn;
  }

  public void translateFromMap() {
    bsdRelationalDefaultGetIn = BsdRelationalDefaultObjectBaseKeyHelper.fromMap(inputMap, "BsdRelationalDefault");
  }

/**
 *
 * Gets the BsdRelationalDefault
 * @return Value of the BsdRelationalDefault
 *
 */

  public BsdRelationalDefaultObjectBaseKeyData getBsdRelationalDefault( ) {
    return bsdRelationalDefaultGetIn;
  }

}
