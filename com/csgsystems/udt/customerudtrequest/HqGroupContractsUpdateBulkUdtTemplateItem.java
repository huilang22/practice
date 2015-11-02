/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupContractsUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqGroupContractsUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupContractsUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupContractsObjectData HqGroupContractsupdate_In;
/**
 *
 * Constructor to create a  HqGroupContractsUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupContractsUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupContractsObjectData HqGroupContractsupdate_InIn) {
    super(id, context, "HqGroupContractsUpdate");
    HqGroupContractsupdate_In = HqGroupContractsupdate_InIn;
  }

  public void translateToMap() {
    if (HqGroupContractsupdate_In != null) {
      HqGroupContractsupdate_In.resetFlags(true, true);
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(HqGroupContractsupdate_In, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }


/**
 *
 * Sets the HqGroupContracts
 * @param HqGroupContractsupdate_InIn Value of the HqGroupContractsupdate_In
 *
 */

  public void setHqGroupContracts(HqGroupContractsObjectData HqGroupContractsupdate_InIn) {
    HqGroupContractsupdate_In = HqGroupContractsupdate_InIn;
  }

  public void translateFromMap() {
    HqGroupContractsupdate_In = HqGroupContractsObjectHelper.fromMap(inputMap, "HqGroupContracts");
  }

/**
 *
 * Gets the HqGroupContracts
 * @return Value of the HqGroupContracts
 *
 */

  public HqGroupContractsObjectData getHqGroupContracts( ) {
    return HqGroupContractsupdate_In;
  }

}
