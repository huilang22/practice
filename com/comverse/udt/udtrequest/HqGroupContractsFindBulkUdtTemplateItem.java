/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqGroupContractsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupContractsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupContractsObjectFilter HQGroupContractsfindIn;
/**
 *
 * Constructor to create a  HqGroupContractsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupContractsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupContractsObjectFilter HQGroupContractsfindInIn) {
    super(id, context, "HqGroupContractsFind");
    HQGroupContractsfindIn = HQGroupContractsfindInIn;
  }

  public void translateToMap() {
    if (HQGroupContractsfindIn != null) {
      Integer index =  HQGroupContractsfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(HQGroupContractsfindIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }


/**
 *
 * Sets the HqGroupContracts
 * @param HQGroupContractsfindInIn Value of the HQGroupContractsfindIn
 *
 */

  public void setHqGroupContracts(HqGroupContractsObjectFilter HQGroupContractsfindInIn) {
    HQGroupContractsfindIn = HQGroupContractsfindInIn;
  }

  public void translateFromMap() {
    HQGroupContractsfindIn = HqGroupContractsObjectHelper.fromMapFilter(inputMap, "HqGroupContracts");
  }

/**
 *
 * Gets the HqGroupContracts
 * @return Value of the HqGroupContracts
 *
 */

  public HqGroupContractsObjectFilter getHqGroupContracts( ) {
    return HQGroupContractsfindIn;
  }

}
