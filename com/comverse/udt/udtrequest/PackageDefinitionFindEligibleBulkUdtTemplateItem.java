/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionFindEligibleBulkUdtTemplateItem.java
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
 * Class used to create a PackageDefinitionFindEligibleBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageDefinitionFindEligibleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityObjectData[] ___entity;
  protected PDObjectFilter package_definition;
  protected Integer ___address_id;
  protected Integer[] ___industry_type;
  protected Date ___effective_date;
  protected Integer level;
  protected Integer ____check_type;
/**
 *
 * Constructor to create a  PackageDefinitionFindEligibleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageDefinitionFindEligibleBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectData[] ___entityIn, PDObjectFilter package_definitionIn, Integer ___address_idIn, Integer[] ___industry_typeIn, Date ___effective_dateIn, Integer levelIn, Integer ____check_typeIn) {
    super(id, context, "PackageDefinitionFindEligible");
    ___entity = ___entityIn;
    package_definition = package_definitionIn;
    ___address_id = ___address_idIn;
    ___industry_type = ___industry_typeIn;
    ___effective_date = ___effective_dateIn;
    level = levelIn;
    ____check_type = ____check_typeIn;
  }

  public void translateToMap() {
    if (___entity != null) {
      if (___entity != null) {
        Object[] list = new Object[___entity.length];
        for (int i = 0; i < ___entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(___entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "PackageDefinition");
        }
        addInput("EntityList", list);
      }
    }
    if (package_definition != null) {
      Integer index =  package_definition.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PackageDefinition", PDObjectHelper.toMap(package_definition, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
    if (___address_id != null) {
      addInput("AddressId", ___address_id);
    }
    if (___industry_type != null) {
      addInput("IndustryTypeList", ___industry_type);
    }
    if (___effective_date != null) {
      addInput("EffectiveDate", ___effective_date);
    }
    if (level != null) {
      addInput("Level", level);
    }
    if (____check_type != null) {
      addInput("CheckType", ____check_type);
    }
  }


/**
 *
 * Sets the Entity
 * @param ___entityIn Value of the ___entity
 *
 */

  public void setEntity(EntityObjectData[] ___entityIn) {
    ___entity = ___entityIn;
  }

/**
 *
 * Sets the PackageDefinition
 * @param package_definitionIn Value of the package_definition
 *
 */

  public void setPackageDefinition(PDObjectFilter package_definitionIn) {
    package_definition = package_definitionIn;
  }

/**
 *
 * Sets the AddressId
 * @param ___address_idIn Value of the ___address_id
 *
 */

  public void setAddressId(Integer ___address_idIn) {
    ___address_id = ___address_idIn;
  }

/**
 *
 * Sets the IndustryType
 * @param ___industry_typeIn Value of the ___industry_type
 *
 */

  public void setIndustryType(Integer[] ___industry_typeIn) {
    ___industry_type = ___industry_typeIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param ___effective_dateIn Value of the ___effective_date
 *
 */

  public void setEffectiveDate(Date ___effective_dateIn) {
    ___effective_date = ___effective_dateIn;
  }

/**
 *
 * Sets the Level
 * @param levelIn Value of the level
 *
 */

  public void setLevel(Integer levelIn) {
    level = levelIn;
  }

/**
 *
 * Sets the CheckType
 * @param ____check_typeIn Value of the ____check_type
 *
 */

  public void setCheckType(Integer ____check_typeIn) {
    ____check_type = ____check_typeIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      ___entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ___entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        ___entity[i].resetFlags(true, true);
      }
    }
    package_definition = PDObjectHelper.fromMapFilter(inputMap, "PackageDefinition");
    ___address_id = (Integer)inputMap.get("AddressId");
    ___industry_type = (Integer[])inputMap.get("IndustryType");
    ___effective_date = (Date)inputMap.get("EffectiveDate");
    level = (Integer)inputMap.get("Level");
    ____check_type = (Integer)inputMap.get("CheckType");
  }

/**
 *
 * Gets the Entity
 * @return Value of the Entity
 *
 */

  public EntityObjectData[] getEntity( ) {
    return ___entity;
  }

/**
 *
 * Gets the PackageDefinition
 * @return Value of the PackageDefinition
 *
 */

  public PDObjectFilter getPackageDefinition( ) {
    return package_definition;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public Integer getAddressId( ) {
    return ___address_id;
  }

/**
 *
 * Gets the IndustryType
 * @return Value of the IndustryType
 *
 */

  public Integer[] getIndustryType( ) {
    return ___industry_type;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return ___effective_date;
  }

/**
 *
 * Gets the Level
 * @return Value of the Level
 *
 */

  public Integer getLevel( ) {
    return level;
  }

/**
 *
 * Gets the CheckType
 * @return Value of the CheckType
 *
 */

  public Integer getCheckType( ) {
    return ____check_type;
  }

}
