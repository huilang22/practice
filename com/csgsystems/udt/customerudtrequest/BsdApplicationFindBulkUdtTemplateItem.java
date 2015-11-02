/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationObjectFilter bsdApplicationFindIn;
/**
 *
 * Constructor to create a  BsdApplicationFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationObjectFilter bsdApplicationFindInIn) {
    super(id, context, "BsdApplicationFind");
    bsdApplicationFindIn = bsdApplicationFindInIn;
  }

  public void translateToMap() {
    if (bsdApplicationFindIn != null) {
      Integer index =  bsdApplicationFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(bsdApplicationFindIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }


/**
 *
 * Sets the BsdApplication
 * @param bsdApplicationFindInIn Value of the bsdApplicationFindIn
 *
 */

  public void setBsdApplication(BsdApplicationObjectFilter bsdApplicationFindInIn) {
    bsdApplicationFindIn = bsdApplicationFindInIn;
  }

  public void translateFromMap() {
    bsdApplicationFindIn = BsdApplicationObjectHelper.fromMapFilter(inputMap, "BsdApplication");
  }

/**
 *
 * Gets the BsdApplication
 * @return Value of the BsdApplication
 *
 */

  public BsdApplicationObjectFilter getBsdApplication( ) {
    return bsdApplicationFindIn;
  }

}
