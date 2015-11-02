/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a BonusPointTransTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointTransTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BonusPointTransTypeObjectFilter BPTTFindIn;
/**
 *
 * Constructor to create a  BonusPointTransTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointTransTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointTransTypeObjectFilter BPTTFindInIn) {
    super(id, context, "BonusPointTransTypeFind");
    BPTTFindIn = BPTTFindInIn;
  }

  public void translateToMap() {
    if (BPTTFindIn != null) {
      Integer index =  BPTTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(BPTTFindIn, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }


/**
 *
 * Sets the BonusPointTransType
 * @param BPTTFindInIn Value of the BPTTFindIn
 *
 */

  public void setBonusPointTransType(BonusPointTransTypeObjectFilter BPTTFindInIn) {
    BPTTFindIn = BPTTFindInIn;
  }

  public void translateFromMap() {
    BPTTFindIn = BonusPointTransTypeObjectHelper.fromMapFilter(inputMap, "BonusPointTransType");
  }

/**
 *
 * Gets the BonusPointTransType
 * @return Value of the BonusPointTransType
 *
 */

  public BonusPointTransTypeObjectFilter getBonusPointTransType( ) {
    return BPTTFindIn;
  }

}
