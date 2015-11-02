/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefFindEligibleBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a PackageComponentDefFindEligibleBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentDefFindEligibleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityObjectData[] ______entity;
  protected PCDObjectFilter package_component_def;
  protected Integer ______address_id;
  protected Integer[] ______industry_type;
  protected Date ______effective_date;
  protected Integer ______check_type;
/**
 *
 * Constructor to create a  PackageComponentDefFindEligibleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentDefFindEligibleBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectData[] ______entityIn, PCDObjectFilter package_component_defIn, Integer ______address_idIn, Integer[] ______industry_typeIn, Date ______effective_dateIn, Integer ______check_typeIn) {
    super(id, context, "PackageComponentDefFindEligible");
    ______entity = ______entityIn;
    package_component_def = package_component_defIn;
    ______address_id = ______address_idIn;
    ______industry_type = ______industry_typeIn;
    ______effective_date = ______effective_dateIn;
    ______check_type = ______check_typeIn;
  }

  public void translateToMap() {
    if (______entity != null) {
      if (______entity != null) {
        Object[] list = new Object[______entity.length];
        for (int i = 0; i < ______entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(______entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "PackageComponentDef");
        }
        addInput("EntityList", list);
      }
    }
    if (package_component_def != null) {
      Integer index =  package_component_def.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageComponentDef", PCDObjectHelper.toMap(package_component_def, new HashMap(), "PackageComponentDef").get("PackageComponentDef"));
    }
    if (______address_id != null) {
      addInput("AddressId", ______address_id);
    }
    if (______industry_type != null) {
      addInput("IndustryTypeList", ______industry_type);
    }
    if (______effective_date != null) {
      addInput("EffectiveDate", ______effective_date);
    }
    if (______check_type != null) {
      addInput("CheckType", ______check_type);
    }
  }


/**
 *
 * Sets the Entity
 * @param ______entityIn Value of the ______entity
 *
 */

  public void setEntity(EntityObjectData[] ______entityIn) {
    ______entity = ______entityIn;
  }

/**
 *
 * Sets the PackageComponentDef
 * @param package_component_defIn Value of the package_component_def
 *
 */

  public void setPackageComponentDef(PCDObjectFilter package_component_defIn) {
    package_component_def = package_component_defIn;
  }

/**
 *
 * Sets the AddressId
 * @param ______address_idIn Value of the ______address_id
 *
 */

  public void setAddressId(Integer ______address_idIn) {
    ______address_id = ______address_idIn;
  }

/**
 *
 * Sets the IndustryType
 * @param ______industry_typeIn Value of the ______industry_type
 *
 */

  public void setIndustryType(Integer[] ______industry_typeIn) {
    ______industry_type = ______industry_typeIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param ______effective_dateIn Value of the ______effective_date
 *
 */

  public void setEffectiveDate(Date ______effective_dateIn) {
    ______effective_date = ______effective_dateIn;
  }

/**
 *
 * Sets the CheckType
 * @param ______check_typeIn Value of the ______check_type
 *
 */

  public void setCheckType(Integer ______check_typeIn) {
    ______check_type = ______check_typeIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      ______entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ______entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        ______entity[i].resetFlags(true, true);
      }
    }
    package_component_def = PCDObjectHelper.fromMapFilter(inputMap, "PackageComponentDef");
    ______address_id = (Integer)inputMap.get("AddressId");
    ______industry_type = (Integer[])inputMap.get("IndustryType");
    ______effective_date = (Date)inputMap.get("EffectiveDate");
    ______check_type = (Integer)inputMap.get("CheckType");
  }

/**
 *
 * Gets the Entity
 * @return Value of the Entity
 *
 */

  public EntityObjectData[] getEntity( ) {
    return ______entity;
  }

/**
 *
 * Gets the PackageComponentDef
 * @return Value of the PackageComponentDef
 *
 */

  public PCDObjectFilter getPackageComponentDef( ) {
    return package_component_def;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public Integer getAddressId( ) {
    return ______address_id;
  }

/**
 *
 * Gets the IndustryType
 * @return Value of the IndustryType
 *
 */

  public Integer[] getIndustryType( ) {
    return ______industry_type;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return ______effective_date;
  }

/**
 *
 * Gets the CheckType
 * @return Value of the CheckType
 *
 */

  public Integer getCheckType( ) {
    return ______check_type;
  }

}
