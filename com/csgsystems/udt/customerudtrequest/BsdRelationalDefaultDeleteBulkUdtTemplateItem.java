/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalDefaultDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalDefaultDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalDefaultDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalDefaultObjectBaseKeyData bsdRelationalDefaultDeleteIn;
/**
 *
 * Constructor to create a  BsdRelationalDefaultDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalDefaultDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalDefaultObjectBaseKeyData bsdRelationalDefaultDeleteInIn) {
    super(id, context, "BsdRelationalDefaultDelete");
    bsdRelationalDefaultDeleteIn = bsdRelationalDefaultDeleteInIn;
  }

  public void translateToMap() {
    if (bsdRelationalDefaultDeleteIn != null) {
      bsdRelationalDefaultDeleteIn.resetFlags(true, true);
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseKeyHelper.toMap(bsdRelationalDefaultDeleteIn, new HashMap(), "BsdRelationalDefaultObjectBaseKeyData").get("BsdRelationalDefaultObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdRelationalDefault
 * @param bsdRelationalDefaultDeleteInIn Value of the bsdRelationalDefaultDeleteIn
 *
 */

  public void setBsdRelationalDefault(BsdRelationalDefaultObjectBaseKeyData bsdRelationalDefaultDeleteInIn) {
    bsdRelationalDefaultDeleteIn = bsdRelationalDefaultDeleteInIn;
  }

  public void translateFromMap() {
    bsdRelationalDefaultDeleteIn = BsdRelationalDefaultObjectBaseKeyHelper.fromMap(inputMap, "BsdRelationalDefault");
  }

/**
 *
 * Gets the BsdRelationalDefault
 * @return Value of the BsdRelationalDefault
 *
 */

  public BsdRelationalDefaultObjectBaseKeyData getBsdRelationalDefault( ) {
    return bsdRelationalDefaultDeleteIn;
  }

}
