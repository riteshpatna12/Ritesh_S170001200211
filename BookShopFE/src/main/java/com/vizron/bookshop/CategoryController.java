package com.vizron.bookshop;


	@Controller
	public class CategoryController {

		
		@Autowired
		private Category category;
		
		@Autowired
		CategoryDAO categoryDAO;
		
		@RequestMapping(value="/categories",method=RequestMethod.GET)
		public String listCategory(Model model)
		{
			model.addAttribute("category",category);
			model.addAttribute("categoryList", categoryDAO.list());
			return "category";
		}
		
		@RequestMapping(value="/category/add",method=RequestMethod.POST)
		public String addCategory(@ModelAttribute("category") Category category){
			
			ModelAndView mv= new ModelAndView();
			if(categoryDAO.get(category.getId())==null)
			{
				categoryDAO.save(category);
			}
			else
			{
				mv.addObject("errormsg","This id already exists "+category.getId());
			}
			
			return "category";
		}
		
		@RequestMapping("category/remove/{id}")
		public ModelAndView deleteCategory(@PathVariable("id") String id) throws Exception
		{
			category=categoryDAO.get(id);
			//boolean flag; 
			String msg;
			if(category !=null)
			{
				 categoryDAO.delete(category);
				 msg="Successfully done the operation";
			}
			else
			{
				msg="Operation failed for deletion of Category";
			}
			ModelAndView mv=new ModelAndView("category");
			
			mv.addObject("msg",msg);
			return mv;
		}
		
		@RequestMapping("category/edit/{id}")
		public ModelAndView deleteCategory(@ModelAttribute("category")Category category) //throws Exception
		{
			ModelAndView mv=new ModelAndView();
			if(categoryDAO.get(category.getId())!=null)
			{
				categoryDAO.update(category);
				mv.addObject("messg", "Updated successfully");
			}
			else
			{
				mv.addObject("errmesg","could not update category");
			}
			
			return mv;
		}
		
	}

