/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionFindByPlanBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrDefinitionFindByPlanBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrDefinitionFindByPlanBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer PlanIdCredit;
  protected Integer LanguageCode;
/**
 *
 * Constructor to create a  UnitCrDefinitionFindByPlanBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrDefinitionFindByPlanBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer PlanIdCreditIn, Integer LanguageCodeIn) {
    super(id, context, "UnitCrDefinitionFindByPlan");
    PlanIdCredit = PlanIdCreditIn;
    LanguageCode = LanguageCodeIn;
  }

  public void translateToMap() {
    if (PlanIdCredit != null) {
      addInput("PlanIdCredit", PlanIdCredit);
    }
    if (LanguageCode != null) {
      addInput("LanguageCode", LanguageCode);
    }
  }


/**
 *
 * Sets the PlanIdCredit
 * @param PlanIdCreditIn Value of the PlanIdCredit
 *
 */

  public void setPlanIdCredit(Integer PlanIdCreditIn) {
    PlanIdCredit = PlanIdCreditIn;
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
    PlanIdCredit = (Integer)inputMap.get("PlanIdCredit");
    LanguageCode = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the PlanIdCredit
 * @return Value of the PlanIdCredit
 *
 */

  public Integer getPlanIdCredit( ) {
    return PlanIdCredit;
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
