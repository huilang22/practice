/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountDefinitionFindByPlanBulkUdtTemplateItem.java
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
 * Class used to create a DiscountDefinitionFindByPlanBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountDefinitionFindByPlanBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer PlanIdDiscount;
  protected Integer LanguageCode;
/**
 *
 * Constructor to create a  DiscountDefinitionFindByPlanBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountDefinitionFindByPlanBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer PlanIdDiscountIn, Integer LanguageCodeIn) {
    super(id, context, "DiscountDefinitionFindByPlan");
    PlanIdDiscount = PlanIdDiscountIn;
    LanguageCode = LanguageCodeIn;
  }

  public void translateToMap() {
    if (PlanIdDiscount != null) {
      addInput("PlanIdDiscount", PlanIdDiscount);
    }
    if (LanguageCode != null) {
      addInput("LanguageCode", LanguageCode);
    }
  }


/**
 *
 * Sets the PlanIdDiscount
 * @param PlanIdDiscountIn Value of the PlanIdDiscount
 *
 */

  public void setPlanIdDiscount(Integer PlanIdDiscountIn) {
    PlanIdDiscount = PlanIdDiscountIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param LanguageCodeIn Value of the LanguageCode
 *
 */

  public void setLanguageCode(Integer LanguageCodeIn) {
    LanguageCode = LanguageCodeIn;
  }

  public void translateFromMap() {
    PlanIdDiscount = (Integer)inputMap.get("PlanIdDiscount");
    LanguageCode = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the PlanIdDiscount
 * @return Value of the PlanIdDiscount
 *
 */

  public Integer getPlanIdDiscount( ) {
    return PlanIdDiscount;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return LanguageCode;
  }

}
