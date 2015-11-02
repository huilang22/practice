/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a DiscountDefinitionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountDefinitionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DiscountDefinitionObjectFilter DDFndIn;
/**
 *
 * Constructor to create a  DiscountDefinitionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountDefinitionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscountDefinitionObjectFilter DDFndInIn) {
    super(id, context, "DiscountDefinitionFind");
    DDFndIn = DDFndInIn;
  }

  public void translateToMap() {
    if (DDFndIn != null) {
      Integer index =  DDFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(DDFndIn, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }


/**
 *
 * Sets the DiscountDefinition
 * @param DDFndInIn Value of the DDFndIn
 *
 */

  public void setDiscountDefinition(DiscountDefinitionObjectFilter DDFndInIn) {
    DDFndIn = DDFndInIn;
  }

  public void translateFromMap() {
    DDFndIn = DiscountDefinitionObjectHelper.fromMapFilter(inputMap, "DiscountDefinition");
  }

/**
 *
 * Gets the DiscountDefinition
 * @return Value of the DiscountDefinition
 *
 */

  public DiscountDefinitionObjectFilter getDiscountDefinition( ) {
    return DDFndIn;
  }

}
