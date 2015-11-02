/*
 * Generated code DO NOT EDIT
 * Generated file: ServicePricingPlanFindByHierarchyBulkUdtTemplateItem.java
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
 * Class used to create a ServicePricingPlanFindByHierarchyBulkUdtTemplateItem Bulk Template
 *
 */

public class ServicePricingPlanFindByHierarchyBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer hierarchy_id;
  protected Integer _language_code;
/**
 *
 * Constructor to create a  ServicePricingPlanFindByHierarchyBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServicePricingPlanFindByHierarchyBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer hierarchy_idIn, Integer _language_codeIn) {
    super(id, context, "ServicePricingPlanFindByHierarchy");
    hierarchy_id = hierarchy_idIn;
    _language_code = _language_codeIn;
  }

  public void translateToMap() {
    if (hierarchy_id != null) {
      addInput("HierarchyId", hierarchy_id);
    }
    if (_language_code != null) {
      addInput("LanguageCode", _language_code);
    }
  }


/**
 *
 * Sets the HierarchyId
 * @param hierarchy_idIn Value of the hierarchy_id
 *
 */

  public void setHierarchyId(Integer hierarchy_idIn) {
    hierarchy_id = hierarchy_idIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param _language_codeIn Value of the _language_code
 *
 */

  public void setLanguageCode(Integer _language_codeIn) {
    _language_code = _language_codeIn;
  }

  public void translateFromMap() {
    hierarchy_id = (Integer)inputMap.get("HierarchyId");
    _language_code = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the HierarchyId
 * @return Value of the HierarchyId
 *
 */

  public Integer getHierarchyId( ) {
    return hierarchy_id;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return _language_code;
  }

}
