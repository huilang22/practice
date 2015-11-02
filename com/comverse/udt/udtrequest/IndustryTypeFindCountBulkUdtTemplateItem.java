/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeFindCountBulkUdtTemplateItem.java
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
 * Class used to create a IndustryTypeFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class IndustryTypeFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected IndustryTypeObjectFilter ITFindCountIn;
/**
 *
 * Constructor to create a  IndustryTypeFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public IndustryTypeFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, IndustryTypeObjectFilter ITFindCountInIn) {
    super(id, context, "IndustryTypeFindCount");
    ITFindCountIn = ITFindCountInIn;
  }

  public void translateToMap() {
    if (ITFindCountIn != null) {
      Integer index =  ITFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("IndustryType", IndustryTypeObjectHelper.toMap(ITFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the IndustryType
 * @param ITFindCountInIn Value of the ITFindCountIn
 *
 */

  public void setIndustryType(IndustryTypeObjectFilter ITFindCountInIn) {
    ITFindCountIn = ITFindCountInIn;
  }

  public void translateFromMap() {
    ITFindCountIn = IndustryTypeObjectHelper.fromMapFilter(inputMap, "IndustryType");
  }

/**
 *
 * Gets the IndustryType
 * @return Value of the IndustryType
 *
 */

  public IndustryTypeObjectFilter getIndustryType( ) {
    return ITFindCountIn;
  }

}
